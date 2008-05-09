  for $i in (1, 2), $j in (3, 4)
    let $k := $i + $j
    where $k >= 5
     return ($i, $j)