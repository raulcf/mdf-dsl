/**
 * MDF API
 * @author ra
 *
 */

class MDF {
	def units
}

interface Unit {
	def dependsOn(Unit u)
	def notAfter(Unit u)
}

interface Task extends Unit {
	
}

interface SimpleTask extends Task {

}

interface ParameterizedTask extends Task {

}

interface ExplorationSpace extends Unit {
	
}

interface Function {
	
}

def explore(Task... tasks) {
	
}

def rank(ExplorationSpace x, Function order, Function filter) {
	
}