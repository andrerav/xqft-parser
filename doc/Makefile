report:
	pdflatex Hoved
	bibtex Hoved
	makeindex Hoved.nlo -s nomencl.ist -o Hoved.nls
	pdflatex Hoved
	pdflatex Hoved

test:
	pdflatex Test
	pdflatex Test
	pdflatex Test
	
flwor:
	pdflatex flowrtree
	pdflatex flowrtree
	pdflatex flowrtree
	
clean:
	find . | grep -v \.svn | grep Hoved | grep -v \.tex$$ | grep -v \.pdf$$ | xargs rm
	find . | grep ~$$ | xargs rm
