for $x in doc("books.xml")/bookstore/book/title
where $x/text() != "The Definitive ANTLR Reference"
order by $x
return <elem></elem>