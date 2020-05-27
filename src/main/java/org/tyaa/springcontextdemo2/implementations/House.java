package org.tyaa.springcontextdemo2.implementations;

import org.tyaa.springcontextdemo2.builder.Unit;
import org.tyaa.springcontextdemo2.interfaces.ICreator;

public abstract class House extends WarriorPool implements ICreator{

	@Override
	public abstract Unit createUnit();


	public abstract WarriorPool setUnitCollection();
}
