report:
	pdflatex Main
	bibtex Main
	makeindex Main.nlo -s nomencl.ist -o Main.nls
	pdflatex Main
	pdflatex Main

conveps:
	# Konvertere EPS til PDF fordi pdflatex suger
	@echo EPS2PDF...
	find .|grep \.eps$$|xargs -l1 epstopdf
	echo DONE

	
clean:
	find . | grep -v \.svn | grep Main | grep -v \.tex$$ | grep -v \.pdf$$ | xargs rm
	find . | grep ~$$ | xargs rm
