<?php

$handle = fopen ("php://stdin","r");
fscanf($handle,"%d",$n);

$result = 0;
$maximum = 0;

while($n > 0){
    if($n%2 == 1){
        $result++;

        if($result>$maximum){
            $maximum = $result;
        }
    }
    else {
        $result = 0;
    }
    $n /= 2;
}
print($maximum);
?>
