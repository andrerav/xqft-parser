report:
	pdflatex Hoved
	bibtex Hoved
	makeindex Hoved.glo -s nomencl.ist -o Hoved.gls
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
	find . | grep Hoved | grep -v \.tex$$ | xargs rm
	find . | grep ~$$ | xargs rm
