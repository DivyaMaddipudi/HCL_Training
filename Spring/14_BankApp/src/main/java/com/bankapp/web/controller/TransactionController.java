package com.bankapp.web.controller;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bankapp.model.dao.TransactionEntry;
import com.bankapp.model.service.AccountService;
import com.bankapp.model.service.TransactionEntryService;
import com.bankapp.web.formbeans.TransferBean;
import com.bankapp.web.formbeans.WithdrawBean;

@Controller
public class TransactionController {
	
	private AccountService accountService;
	private TransactionEntryService transactionEntryService;
	
	@Autowired
	public TransactionController(AccountService accountService, TransactionEntryService transactionEntryService) {
		this.accountService = accountService;
		this.transactionEntryService = transactionEntryService;
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}


	@GetMapping("transfer")
	public String transferGet(ModelMap map) {
		map.addAttribute("transferBean", new TransferBean());
		return "transfer";
	}
	
	@PostMapping("transfer") 
	public String transferPost(@Valid @ModelAttribute("transferBean") TransferBean transferBean, BindingResult result) {
		
		if(result.hasErrors()) {
			return "transfer";
		} else {
		int fromAccountId = transferBean.getFromAccountId();
		int toAccountId = transferBean.getToAccountId();
		Double amount = transferBean.getAmount();
		accountService.transfer(fromAccountId, toAccountId, amount);
		return "success";
		}
	}
	
	@GetMapping("withdraw")
	public String withdrawGet(ModelMap map) {
		map.addAttribute("withdrawBean", new WithdrawBean());
		return "withdraw";
	}
	
	@PostMapping("withdraw") 
	public String withdrawPost(@Valid @ModelAttribute("withdrawBean") WithdrawBean withdrawBean, BindingResult result) {
		if(result.hasErrors()) {
			return "withdraw";
		} else {
		int accountId = withdrawBean.getAccountId();
		Double amount = withdrawBean.getAmount();
		accountService.withdraw(accountId, amount);
		return "success";
		}
	}
	
	@GetMapping("deposit")
	public String depositGet(ModelMap map) {
		map.addAttribute("depositBean", new WithdrawBean());
		return "deposit";
	}
	
	@PostMapping("deposit") 
	public String depositPost(@Valid @ModelAttribute("depositBean") WithdrawBean withdrawBean, BindingResult result) {
		if(result.hasErrors()) {
			return "deposit";
		} else {
		int accountId = withdrawBean.getAccountId();
		Double amount = withdrawBean.getAmount();
		accountService.deposit(accountId, amount);
		return "success";
		}
	}
	
	@GetMapping("getalltransactions")
	public ModelAndView transactionsHistory(HttpServletRequest request, ModelAndView mv) {
		int accountId = Integer.parseInt(request.getParameter("id"));
		System.out.println("transaction id--------------------------------------------- "+ accountId);
		List<TransactionEntry> transactionHistory = transactionEntryService.getTransactionsById(accountId);
		mv.setViewName("transactionhistory");
		mv.addObject("transactionHistory", transactionHistory);
		return mv;
	}
}
