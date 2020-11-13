function valid() {
    
    var name = document.getElementById("nameId").value;
    console.log(name);
    var phoneNumber = document.getElementById("phoneNumberId").value;
    var course = document.getElementById("courseId").value;

    if(isBlank(name)) {
        document.getElementById("nameMsg").innerHTML = "Please enter your name";
        document.getElementById("nameMsg").style.color =  "red";
        return false;
    }

    if(!isValidPhoneNumber(phoneNumber)) {
        document.getElementById("phoneNumberMsg").innerHTML = "Please enter valid phone number";
        document.getElementById("phoneNumberMsg").style.color =  "red";
        return false;
    }

    if(isBlank(course)) {
        document.getElementById("courseMsg").innerHTML = "Please enter course name";
        document.getElementById("courseMsg").style.color =  "red";
        return false;
    }


return true;
}

function isBlank(val) {
    return (val==="")?true:false;
}

function isValidPhoneNumber(phoneNumber) {
    var phoneRegex = /^[6-9]{2}[0-9]{8}$/;
    return phoneNumber.match(phoneRegex)?true:false;
}

function enabled() {
    
    var relationYes = document.getElementById("yes").value; 
    var relationNo = document.getElementById("no").value;

    if(relationYes === "yes") {
        document.getElementsByClassName("visible").disabled = true;
    } else if(relationNo === "no"){
        document.getElementsByClassName("visible").disabled = false;
    }

    console.log("done");
    
}
