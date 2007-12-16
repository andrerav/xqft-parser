for $b in /books/book
where $b/title ftcontains ("dog" with stemming case sensitive) ftand "cat" 
return $b/author