  for $i in (1, 2) return
    for $j in (3, 4) return
      let $k := $i + $j return
        if ($k >= 5) then 
          ($i, $j)
        else
          ()