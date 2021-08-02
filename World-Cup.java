public static void main(String[] args) {
    var group = new ArrayList<>(List.of(
            "Portugal", "England", "Italy",
            "Brazil", "France","Egypt"
    ));
    var group2 = new ArrayList<>(List.of(
            "Germany", "Spain", "Argentina",
            "Belgium", "Algeria","Qatar"
    ));
    Map<String, String> generatedGroups = new HashMap<>();
    List<String> groupNames = List.of("A", "B", "C", "D", "E","F");
    groupNames.stream().map(a -> formatGroup(a, group, group2, generatedGroups))
            .forEach(System.out::println);
}

private static String formatGroup(
        String a, ArrayList<String> group, ArrayList<String> group2,
        Map<String, String> generatedNums) {
    String[] vSgroup = groupGenerator(group2, group, generatedNums);
    return String.format("Group %s\n%s Vs. %s\n%s\n%s", a, vSgroup[0],
            vSgroup[1],group,group2);
}

private static String[] groupGenerator(ArrayList<String> group2, ArrayList<String> group,
                                       Map<String, String> generatedGroups) {
    int indexOfFirstTeam;
    int indexOfSecondTeam;
    int groupNumber = 0;
    do {
        indexOfFirstTeam = getRandomNum(group);
        indexOfSecondTeam = getRandomNum(group2);
    } while (generatedGroups.containsValue(generatedGroups.get(group.get(indexOfFirstTeam))));



    generatedGroups.put(group.get(indexOfFirstTeam), group2.get(indexOfSecondTeam));
    String[] vsGroup = new String[]{group.get(indexOfFirstTeam), group2.get(indexOfSecondTeam)};
    HashMap<String,String> setGroup = new HashMap<>();
    /*
    String GroupA = setGroup.put(group.get(indexOfFirstTeam),group.get(indexOfSecondTeam));
    */
    group.remove(indexOfFirstTeam);
    group2.remove(indexOfSecondTeam);
    return vsGroup;
}

private static Integer getRandomNum(ArrayList<String> group) {
    return ThreadLocalRandom.current().nextInt(0, group.size());
}
