class SearchTests{
	public static void main(String [] args){
		Searchs s = new Searchs();
		String sentence = s.inputString("����: ");
		String keyword = s.inputString("�˻��� �ܾ�: ");
		s.searchKeyword(sentence, keyword);
	}
}