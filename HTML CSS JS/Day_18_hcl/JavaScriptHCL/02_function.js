function add(a, b) {
    var sum = 0;

    for(var count=0;count<arguments.length;count++) {
        sum+= arguments[count];
    }
    return sum;
}

