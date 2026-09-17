class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> rmap = new HashMap<>();
        HashMap<Character, Integer> mmap = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (rmap.containsKey(c)) {
                int f = rmap.get(c);
                rmap.put(c, f + 1);
            } else {
                rmap.put(c, 1);
            }
        }
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (mmap.containsKey(c)) {
                int f = mmap.get(c);
                mmap.put(c, f + 1);
            } else {
                mmap.put(c, 1);
            }
        }
        for (char e : rmap.keySet()) {
            if (!mmap.containsKey(e) || rmap.get(e) > mmap.get(e))
                return false;
        }
        return true;
    }
}

