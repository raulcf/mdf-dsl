/**
 * MDF API
 * @author ra
 *
 */

def explore(Task... tasks) {
	
	return new ExplorationSpace()
}

class ExplorationSpace {
	
}

class Ranker {
	UtilityFunction uf
	Sorter s
	Filter f
}

class UtilityFunction {
	Input input
	def computeUtility(){
		
	}
}

class Input {
	Schema s
	Data d
	// data and schema
}

class Data {
	// Represents output data from some task
}

class Schema {
	// Basically define a bean with a record input
}

class Sorter {
	Sequence values
	
	def sorter() {
		
	}
}

class Filter {
	Sequence values
	
	def filter() {
		
	}
}

class Stage {
	Sequence xspaces
}

class MDF {
	Sequence stages
}

interface Task {
	
}

interface ParameterizedTask extends Task {
	
}