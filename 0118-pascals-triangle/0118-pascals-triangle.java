class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
 // 2중 for문 파스칼 삼격형의 양 끝은 1이기 때문에 시작에 1을 넣고 나머지는 바로 윗 층의 List를 이용
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(1);

            if (i != 0) {
                row.add(1);
            }

            for (int j = 0; j < i - 1; j++) {
                List<Integer> before = res.get(i - 1);
                row.add(before.get(j) + before.get(j + 1));
            }

            row.add(1);
            res.add(row);
        }

        return res;
    }
}