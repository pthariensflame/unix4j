package org.unix4j.unix.sort;

import org.unix4j.command.AbstractLineProcessor;
import org.unix4j.command.ExecutionContext;
import org.unix4j.line.Line;
import org.unix4j.line.LineProcessor;

class MergeLineProcessor extends AbstractLineProcessor<SortArguments> {

	public MergeLineProcessor(SortCommand command, ExecutionContext context, LineProcessor output) {
		super(command, context, output);
		throw new RuntimeException("not impelemented");
	}

	@Override
	public boolean processLine(Line line) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

}
