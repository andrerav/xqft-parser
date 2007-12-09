for $b in /books/book
where $b/title ftcontains ("dog" with stemming) ftand "cat" 
return $b/author