simple: 
	pdflatex Main



dotgraphs:
	for i in `ls graph_src|grep \.dot$$|sed -e 's/\.dot$$//'`; do cat graph_src/$$i.dot|dot -Tpdf -oimg/graphs/$$i.pdf; done;


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
	find . | grep -v Makefile | grep -v \.svn | grep -v \.tex$$ | grep -v \.pdf$$ | xargs rm
	find . | grep ~$$ | xargs rm
