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