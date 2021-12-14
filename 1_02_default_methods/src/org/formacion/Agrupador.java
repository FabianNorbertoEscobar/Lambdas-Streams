package org.formacion;

import java.util.Collection;

public interface Agrupador {

	void add (Object elemento);
	
	int numeroElementos();

	default void addAll(@SuppressWarnings("rawtypes") Collection collection) {
		for (Object object : collection) {
			this.add(object);
		}
	}
	
}
