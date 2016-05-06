package inpowered.ml.regression.service;

import org.springframework.stereotype.Service;

@Service
public class RegressionCountServiceImpl implements RegressionCountService {

	public Integer getViewCount(String link, String title, String authorActorId, String pubDate) throws Exception {
		return 5;
	}	
	
}
