<?php
$_fp = fopen("php://stdin", "r");
/* Enter your code here. Read input from STDIN. Print output to STDOUT */
$_number = fgets($_fp);
print(factorial($_number));
fclose($_fp);

function factorial($_number){
    if($_number == 0){
        return 1;
    } else {
        return $_number * factorial($_number -1);
    }
}

?>