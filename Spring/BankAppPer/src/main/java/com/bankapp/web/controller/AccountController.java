package com.bankapp.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bankapp.model.dao.TransactionType;
import com.bankapp.model.dao.Transactions;
import com.bankapp.model.service.TransactionService;

@Controller
public class AccountController {
	
	TransactionService transactionService;

	@Autowired
	public AccountController(TransactionService transactionService) {
		this.transactionService = transactionService;
	}
	
	@GetMapping("/")
	public ModelAndView home(ModelAndView mv) {
		mv.setViewName("show");
		return mv;
	}
	
	@GetMapping("signup")
	public String signupGet(ModelMap map) {
		map.addAttribute("account", new Transactions());
		return "signup";
	}
	
	@PostMapping("signup")
	public String signupPost(@ModelAttribute("account") Transactions transaction, HttpServletRequest req, ModelMap map) {
		String accountNumber = transactionService.generateAccountNumber();
		Transactions transactions = new Transactions(accountNumber, transaction.getAccountHolderName(), transaction.getPassword() , 500, TransactionType.netBanking);
		transactionService.saveAccount(transactions);
		map.addAttribute("account", new Transactions());
		return "login";
	}
	
	@GetMapping("login")
	public String loginGet(ModelMap map) {
		map.addAttribute("account", new Transactions());
		return "login";
	}
	
	@PostMapping("login")
	public String loginPost(@ModelAttribute("account") Transactions transaction, HttpServletRequest req) {
		String accountName = transaction.getAccountHolderName();
		String accountNumber = transaction.getAccountNumber();
		String password = transaction.getPassword();
		String value = "";
		
		boolean isValid = transactionService.verifyDetails(accountName, password, accountNumber);
		if(isValid) {
			HttpSession session = req.getSession();
			session.setAttribute("accountNumber", accountNumber);
			value = "home";
		} else {
			value = "error";
		}
		
		return value;
		
	}
	
	@GetMapping("getTransactions")
	public String transferFundGet(ModelMap map) {
		map.addAttribute("transactions", new Transactions());
		return "transferMoney";
	}
	
	@GetMapping("home")
	public String home() {
		return "home";
	}

	@PostMapping("transferMoney")
	public String transferMoneyPost(HttpServletRequest req) {
		String fromAccount = req.getParameter("fromaccount");
		String toAccount = req.getParameter("accountNumber");
		long amount = Long.parseLong(req.getParameter("amount"));
		transactionService.transferAmount(fromAccount, toAccount, amount);
		return "redirect:/home";
	}
	
	@GetMapping("checkBalance")
	public String checkBalance(HttpServletRequest req, ModelMap map) {
		HttpSession session = req.getSession();
		String id = (String) session.getAttribute("accountNumber");
		map.addAttribute("balance", transactionService.checkBalance(id));
		return "home";
	}
	
	@GetMapping("logout") 
	public String logout() {
		return "redirect:/";
	}
}
