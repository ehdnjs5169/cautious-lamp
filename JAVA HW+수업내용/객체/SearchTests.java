class SearchTests{
	public static void main(String [] args){
		Searchs s = new Searchs();
		String sentence = s.inputString("문장: ");
		String keyword = s.inputString("검색할 단어: ");
		s.searchKeyword(sentence, keyword);
	}
}