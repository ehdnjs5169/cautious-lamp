class searchTest{
	public static void main(String [] args){
		search s = new search();
		String sentence = s.inputString("����:");
		String keyword = s.inputString("ã�� �ܾ�: ");
		s.searchkeyword(sentence, keyword);
	}
}