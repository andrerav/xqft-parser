  for $i as xs:integer in (1, 2),
      $j in (3, 4)
  let $k := $i + $j
  where $k >= 5
  return
    <tuple>
       <i> { $i } </i>
       <j> { $j } </j>
    </tuple>