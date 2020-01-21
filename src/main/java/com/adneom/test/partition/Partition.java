package com.adneom.test.partition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;

public class Partition {
	
	public final static Logger LOGGER = Logger.getLogger(Partition.class);
	public static <T> List<List<T>> chunk(List<T> liste, int taille) {
		if (liste == null) {
			LOGGER.debug("Your list is empty, please provide another one.");
			return Collections.emptyList();
		}
		if (taille <= 0) {
			LOGGER.debug("Length provided could not be resolved.");
			return Collections.emptyList(); 
		}
		int numOfChunks = (int)Math.ceil((double)liste.size() / taille);
		List<List<T>> output = new ArrayList<List<T>>();
        for(int i = 0; i < numOfChunks; ++i) {
        	int start = i * taille;
            int end = Math.min(start + taille, liste.size());
            if (start > end) {
                LOGGER.debug("Index " + i + " is out of the list range");
                return Collections.emptyList();
            }
            output.add(liste.subList(start, end));
        }

        return output;
	}
}
