class Solution {
    public List<List<Integer>> generate(int num) {
        List<List<Integer>> r = new ArrayList<List<Integer>>();
		List<Integer> row, p = null;
		for (int i = 0; i < num; ++i) {
			row = new ArrayList<Integer>();
			for (int j = 0; j <= i; ++j)
				if (j == 0 || j == i)
					row.add(1);
				else
					row.add(p.get(j - 1) + p.get(j));
			p = row;
			r.add(row);
		}
		return r;
    }
}