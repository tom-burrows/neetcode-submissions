class TimeMap {
    private Map<String, List<Pair<Integer, String>>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        Pair<Integer, String> pair = new Pair(timestamp, value);
        List<Pair<Integer, String>> list = map.computeIfAbsent(key, l -> new ArrayList<Pair<Integer, String>>());
        list.add(pair);
        map.put(key, list);
    }
    
    public String get(String key, int timestamp) {
        List<Pair<Integer, String>> list = map.getOrDefault(key, new ArrayList<>());
        System.out.println(list.toString());
        int l = 0, r = list.size() - 1;
        String result = "";

        while (l <= r) {
            int mid = (l + r) / 2;
            Pair<Integer, String> cur = list.get(mid);

            if (cur.first() <= timestamp) {
                result = cur.second();
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return result;

    }
}

private static class Pair<K,V> {
            private final K key;
            private final V value;

            public Pair(K key, V value) {
                this.key = key;
                this.value = value;
            }

            public K first(){
                return key;
            }
            public V second(){
                return value;
            }
        };
