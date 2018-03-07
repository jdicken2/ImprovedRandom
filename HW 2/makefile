JFLAGS = -g 
JC = javac 
JE= java 
.SUFFIXES: .java .class
.java.class:
		$(JC) $(JFLAGS) $*.java

CLASSES = \
        ImprovedRandom.java \
        ImprovedStringTokenizer.java \
        hw2AcceptanceTest.java \
        ImprovedJUnitTest.java \
        TestRunner.java 

default: classes run

classes: $(CLASSES:.java=.class)

run:
		$(JE) hw2AcceptanceTest
test:   
		 $(JE) TestRunner
	
clean:
		$(RM) *.class