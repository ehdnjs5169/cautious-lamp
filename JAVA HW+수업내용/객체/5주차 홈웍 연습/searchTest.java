class searchTest{
	public static void main(String [] args){
		search s = new search();
		String sentence = s.inputString("문장:");
		String keyword = s.inputString("찾을 단어: ");
		s.searchkeyword(sentence, keyword);
	}
}