package org.evesim.usecase.services;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EveSemanticSearchServiceClass {
	public final static String WORD_SEPARATION_REGEX = "[\\dS\\[\\]\\(\\)\\s\\\" \\ \\,\\.\\?\\!]++";


	private final static Logger logger = Logger.getLogger(EveSemanticSearchServiceClass.class.getName());

	public EveSemanticSearchServiceClass() {

	}

	/**
	 * @param request
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<String> doSearch(List<String> list, String request) {


		// get the keywords from the demanded service
		ArrayList<String> searchKeywords = extractKeywords(request);
		int keywordCount = searchKeywords.size();

		// initialize the result list
		ArrayList<String> result = new ArrayList<String>();

		// iterate over the local service pool and compare each item
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String s = iter.next();

			// get the keywords from the offered service and compare.
			// the resulting "ranking" is put to the result list with the item in
			// a wrapper class
			ArrayList<String> kw = extractKeywords(s);
			int matchedKeywordCount = compareKeywordSets(searchKeywords, kw);
			float ranking = (float)matchedKeywordCount / (float)keywordCount;             
			//EveFitness tmp = new EveFitness(s, ranking);
			result.add(s+","+ranking);
		}

		Collections.sort(result);

		logger.log(Level.INFO,"Semantic Search Service answering request...");
		return result;

	}

	/**
	 * This service extracts the keywords used for the comparison.
	 * Not implemented yet
	 *
	 * Possible tool to use:
	 * http://www.nzdl.org/Kea/index.html
	 *
	 * @param in
	 * @return
	 */
	public ArrayList<String> extractKeywords(String in) {
		ArrayList<String> result = new ArrayList<String>();

		// all processing is done in lower case
		in = in.toLowerCase();

		// Split words and add to array
		String[] tmp = in.split(WORD_SEPARATION_REGEX);
		Collections.addAll(result, tmp);

		// Remove empty elements
		result.remove("");

		// TODO: word normalization is missing.

		// TODO: after normalization duplicates may have to be removed.

		// Order keywords
		Collections.sort(result);


		// TODO: implement
		return result;
	}

	/**
	 * This service compares one service's keywords with the demanded keywords
	 * and returns a ranking as a float number
	 *
	 * Not implemented yet.
	 *
	 * @param demandedService
	 * @param serviceToCheck
	 * @return
	 */
	public int compareKeywordSets(ArrayList<String> demandedService, ArrayList<String> serviceToCheck) {
		int result = 0;
		Iterator<String> iter = demandedService.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			if (serviceToCheck.contains(str)) {
				result++;
			}
		}

		return result;
	}

	/*
	 * Method to test the sorting of the result elements
	 *
    public static void main(String[] args) {
    ArrayList<SemSearchResultWrapper> result = new ArrayList<SemSearchResultWrapper>();
    result.add(new SemSearchResultWrapper(null, 1));
    result.add(new SemSearchResultWrapper(null, 2));
    result.add(new SemSearchResultWrapper(null, 0));
    Collections.sort(result);
    System.out.println(result);

    }
	 */

	/*
	 * Method to test the keywords extraction
	 */
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		String in = "A Web service (also Web Service) is defined by the W3C as \"a software system designed to support interoperable machine-to-machine interaction over a network\".[1] Web services are frequently just Web application programming interfaces (API) that can be accessed over a network, such as the Internet, and executed on a remote system hosting the requested services. Other approaches with nearly the same functionality are Object Management Group's (OMG) Common Object Request Broker Architecture (CORBA), Microsoft's Distributed Component Object Model (DCOM) or SUN's Java/Remote Method Invocation (RMI).";
		System.out.println("in: " + in);
		ArrayList tmp = new EveSemanticSearchServiceClass().extractKeywords(in);
		System.out.println("out: " + tmp);
		System.out.println("nr of elements: " + tmp.size());
	}
}
