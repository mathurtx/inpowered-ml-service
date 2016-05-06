package inpowered.ml.regression.service;

public interface RegressionCountService {
	
	public Integer getViewCount(String link, String title, String summary, String authorActorId, String pubDate) throws Exception;
	
}
