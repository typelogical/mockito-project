
package org.mockitoproject.service;

import org.mockitoproject.*;

public interface TakeParamInterface {
	public Something takeParameter(String description);
	public void takeParameters(String param1, String param2, String param3);
}