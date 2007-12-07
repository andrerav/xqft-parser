declare function local:order-value($po as element(purchase-order))
   as xs:double {
      sum($po/order-item/(@price * @quantity))
};

<ul>
{
for $x in doc("books.xml")/bookstore/book/title
order by $x
return <li>{
	for $y in doc("books.xml")/bookstore/book/title
	order by $y
	return <li>{$y}</li>
}</li>
}
</ul>