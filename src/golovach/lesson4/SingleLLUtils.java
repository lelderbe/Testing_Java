package golovach.lesson4;

import java.util.Arrays;

/**
 * Created by user on 28.03.2016.
 */
public class SingleLLUtils {

    public static String toString(Node list) {
        return toStringIter(list);
//        return toStringRec(list);
    }

    private static String toStringIter(Node list) {
        String result = "";
        while (true) {
            if (list != null) {
                result += list.value + "->";
                list = list.next;
            } else {
                result += "*";
                break;
            }
        }
        return result;
    }

    private static String toStringRec(Node list) {
        return (list == null) ? "*" : list.value + "->" + toStringRec(list.next);
    }


//    public static Node init(Node list) {
//        for (int i = 0; i < 5; i++) {
//            return new Node(i, init())
//        }
//    }


    public static Node genList(int... values) {
//        return genListIter(values);
        return genListRec(values);
    }

    private static Node genListIter(int... values) {
        Node list = null;

        for (int i = values.length - 1; i >= 0; i--) {
            list = new Node(i, list);
        }

        return list;
    }

    private static Node genListRec(int... values) {
        if (values.length == 0) {
            return null;
        } else {
            return new Node(values[0], genListRec(Arrays.copyOfRange(values, 1, values.length)));
        }
    }

    public static void add(Node list, int value) {
        addIter(list, value);
//        addRec(list, value);
    }

    private static void addIter(Node list, int value) {
        while (list.next != null) {
            list = list.next;
        }
        list.next = new Node(value, null);
    }

    private static void addRec(Node list, int value) {
        if (list.next != null) {
            addRec(list.next, value);
        } else {
            list.next = new Node(value, null);
        }
    }

    public static int length(Node list) {
//        return lengthIter(list);
        return lengthRec(list);
    }

    private static int lengthIter(Node list) {
        int count = 1;
        if (list == null) {
            return 0;
        } else {
            while (list.next != null) {
                list = list.next;
                count++;
            }
            return count;
        }
    }

    private static int lengthRec(Node list) {
        return (list == null) ? 0 : 1 + lengthRec(list.next);
    }

    public static int max(Node list) {
//        return maxIter(list);
        return maxRec(list);
    }

    private static int maxIter(Node list) {
        if (list == null) {
            return 0;
        } else {
            int max = list.value;

            while (list.next != null) {
                list = list.next;
                if (list.value > max) {
                    max = list.value;
                }
            }

            return max;
        }
    }

    private static int maxRec(Node list) {
        return (list == null) ? 0 : Math.max(list.value, maxRec(list.next));

//        if (list != null) {
//            if (list.next != null) {
//                int tmp = maxRec(list.next);
//                if (list.value > tmp) {
//                    return list.value;
//                } else {
//                    return tmp;
//                }
//            } else {
//                return list.value;
//            }
//        } else {
//            return 0;
//        }
    }

    public static int sum(Node list) {
//        return sumIter(list);
        return sumRec(list);
    }

    private static int sumIter(Node list) {
        if (list != null) {
            int sum = list.value;
            while (list.next != null) {
                list = list.next;
                sum += list.value;
            }
            return sum;
        } else {
            return 0;
        }
    }

    private static int sumRec(Node list) {
        return (list == null) ? 0 : list.value + sumRec(list.next);

//        if (list != null) {
//            return (list.next == null) ? list.value : list.value + sumRec(list.next);
//        } else {
//            return 0;
//        }
    }


    public static Node insertInPosition(Node list, int position, int value) {
        return insertInPositionIter(list, position, value);
//        return insertInPositionRec(list, position, value);
    }

    private static Node insertInPositionIter(Node list, int position, int value) {
        if (position == 0) {
            list = new Node(value, list);
        } else {
            Node tmp = list;
            for (int i = 0; i < position - 1; i++) {
                if (tmp.next != null) {
                    tmp = tmp.next;
                }
            }
            tmp.next = new Node(value, tmp.next);
        }
        return list;

    }

    private static Node insertInPositionRec(Node list, int position, int value) {
        if (position != 1) {
            insertInPositionRec(list.next, position - 1, value);
        } else {
            list.next = new Node(value, list);
        }

        return list;

//        if (position == 0) {
//            return list = new Node(value, list.next);
//        }

    }

    public static Node remove(Node list) {
//        return removeIter(list);
        return removeRec(list);
    }

    private static Node removeIter(Node list) {
        Node copy = list;
        if (list == null || list.next == null) {
            return null;
        }

        while (list.next.next != null ) {
            list = list.next;
        }

        list.next = null;
        return copy;

    }

    private static Node removeRec(Node list) {
        if (list == null || list.next == null) {
            return null;
        }

        if (list.next.next == null) {
            list.next = null;
        } else {
            removeRec(list.next);
        }
        return list;
    }

    public static boolean isGrowing(Node list, int value) {
        return isGrowingRec(list, value);
    }

    private static boolean isGrowingRec(Node list, int value) {
        if (list == null) {
            return false;
        }
        if (list.value > value) {

//            return (list.value > value) ? true && isGrowingRec(list.next, list.value) : false;

            if (list.next != null) {
                return true && isGrowingRec(list.next, list.value);
            } else {
                return true;
            }
        } else {
            return false;
        }
    }



}
