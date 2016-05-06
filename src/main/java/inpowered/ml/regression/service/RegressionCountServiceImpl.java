package inpowered.ml.regression.service;

import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.util.PythonInterpreter;
import org.springframework.stereotype.Service; 

@Service
public class RegressionCountServiceImpl implements RegressionCountService {

	public Integer getViewCount(String link, String title, String summary, String authorActorId, String pubDate) throws Exception {
		PythonInterpreter interpreter = new PythonInterpreter();
		//interpreter.set("myvariable", 21);
		interpreter.execfile("//Users/mathurtx/Documents/inpowered/Prediction.py");
		PyObject getPrediction = interpreter.get("predictor");
		PyObject result = getPrediction.__call__(new PyString(authorActorId),new PyString(summary));
		String realResult = (String) result.__tojava__(String.class);
		return Integer.parseInt(realResult);
	}	
	
}
