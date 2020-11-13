function valid() {
    
    var name = document.getElementById("nameId").value;
    var password = document.getElementById("passwordId").value;
    var email = document.getElementById("emailId").value;
    var phoneNumber = document.getElementById("phoneNumberId").value;

    if(isBlank(name)) {
        document.getElementById("nameMsg").innerHTML = "Please enter your name";
        document.getElementById("nameMsg").style.color =  "red";
        return false;
    }

    if(isBlank(password)) {
        document.getElementById("passwordMsg").innerHTML = "Please enter your name";
        document.getElementById("passwordMsg").style.color =  "red";
        return false;
    }

    if(!isValidEmail(email)) {
        document.getElementById("emailMsg").innerHTML = "Please enter valid email";
        document.getElementById("emailMsg").style.color =  "red";
        return false;
    }

    if(!isValidPhoneNumber(phoneNumber)) {
        document.getElementById("phoneNumberMsg").innerHTML = "Please enter 10 digit valid phone number";
        document.getElementById("phoneNumberMsg").style.color =  "red";
        return false;
    }
return true;
}

function isBlank(val) {
    return (val=='')?true:false;
}

function isValidPhoneNumber(phoneNumber) {
    var phoneRegex = /^[6-9]{2}[0-9]{8}$/;
    return phoneNumber.match(phoneRegex)?true:false;
}

function isValidEmail(email) {
    var emailRegex = /^[A-Za-z0-9]{8, 20}+@[a-zA-Z0-9.]{3, 10}+.[a-zA-Z0-9-.]{2, 4}+$/;
    return email.match(emailRegex)?true:false;
}
