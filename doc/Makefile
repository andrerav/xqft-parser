report:
	# Konvertere EPS til PDF fordi pdflatex suger
	echo EPS2PDF...
	find .|grep \.eps$$|xargs -l1 epstopdf
	echo DONE
	pdflatex Hoved
	bibtex Hoved
	makeindex Hoved.nlo -s nomencl.ist -o Hoved.nls
	pdflatex Hoved
	pdflatex Hoved

conveps:

	
clean:
	find . | grep -v \.svn | grep Hoved | grep -v \.tex$$ | grep -v \.pdf$$ | xargs rm
	find . | grep ~$$ | xargs rm
