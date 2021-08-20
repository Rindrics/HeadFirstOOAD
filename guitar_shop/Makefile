JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Builder.java \
	Guitar.java \
	FindInstrumentTester.java \
	InstrumentSpec.java \
	Instrument.java \
	InstrumentType.java \
	Inventory.java \
	Type.java \
	Wood.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
