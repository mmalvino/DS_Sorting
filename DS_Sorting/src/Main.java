import java.util.Arrays;

public class Main {
    public static int[] arrayData = {887, 259, 622, 642, 465, 963, 350, 914, 983, 214, 544, 952, 490, 706, 380, 227, 262, 190, 975, 701, 899, 283, 447, 804, 526, 309, 124, 429, 436, 452, 395, 785, 807, 203, 677, 135, 437, 812, 537, 73, 840, 927, 746, 743, 396, 763, 484, 322, 960, 301, 335, 228, 171, 468, 421, 197, 660, 111, 49, 553, 147, 78, 399, 433, 592, 875, 587, 565, 854, 549, 738, 697, 243, 315, 443, 951, 694, 863, 605, 461, 480, 302, 279, 97, 883, 548, 439, 264, 928, 546, 942, 358, 348, 749, 971, 925, 893, 714, 434, 106, 385, 141, 271, 892, 154, 620, 572, 157, 205, 857, 693, 796, 19, 210, 753, 45, 762, 604, 234, 441, 446, 133, 92, 978, 50, 890, 730, 472, 532, 511, 685, 947, 368, 265, 387, 177, 651, 884, 110, 590, 31, 618, 621, 864, 370, 226, 290, 297, 371, 835, 754, 676, 909, 420, 143, 131, 21, 16, 128, 917, 992, 726, 352, 541, 199, 91, 636, 851, 107, 418, 771, 69, 53, 530, 240, 987, 933, 919, 507, 344, 838, 206, 144, 201, 818, 819, 935, 607, 516, 486, 431, 868, 502, 278, 221, 361, 198, 545, 748, 464, 908, 704, 708, 791, 879, 415, 253, 38, 781, 266, 766, 798, 820, 423, 66, 176, 870, 894, 272, 376, 716, 886, 552, 623, 784, 281, 814, 783, 815, 489, 551, 821, 638, 958, 554, 323, 95, 430, 994, 100, 594, 828, 569, 223, 495, 713, 519, 539, 739, 246, 522, 4, 390, 1, 573, 614, 196, 367, 671, 910, 84, 136, 321, 888, 720, 238, 700, 273, 930, 731, 406, 993, 903, 915, 823, 912, 156, 839, 215, 656, 261, 529, 943, 953, 808, 695, 538, 132, 336, 895, 725, 448, 193, 483, 329, 898, 82, 792, 342, 23, 244, 46, 101, 773, 378, 941, 500, 938, 444, 904, 986, 313, 35, 5, 24, 586, 841, 610, 402, 48, 830, 219, 116, 249, 179, 980, 633, 230, 270, 412, 889, 924, 113, 514, 878, 466, 426, 54, 267, 305, 793, 200, 845, 158, 67, 493, 657, 105, 18, 790, 148, 741, 747, 473, 769, 346, 735, 501, 280, 688, 463, 616, 602, 403, 187, 661, 208, 155, 644, 920, 487, 881, 129, 2, 212, 164, 168, 172, 536, 392, 494, 782, 30, 496, 977, 768, 449, 837, 503, 968, 229, 640, 649, 232, 721, 475, 850, 479, 469, 724, 127, 77, 222, 646, 965, 488, 882, 231, 756, 873, 80, 40, 317, 585, 624, 811, 613, 353, 33, 333, 497, 373, 595, 842, 413, 652, 194, 237, 534, 56, 216, 702, 169, 428, 764, 188, 934, 362, 512, 949, 311, 119, 61, 770, 451, 765, 393, 62, 263, 366, 456, 291, 295, 112, 998, 913, 442, 218, 34, 824, 728, 391, 287, 356, 44, 58, 424, 224, 300, 558, 689, 477, 568, 767, 47, 520, 936, 343, 560, 14, 598, 508, 707, 672, 87, 853, 28, 950, 108, 760, 137, 427, 608, 204, 326, 255, 988, 603, 964, 29, 316, 109, 682, 411, 905, 885, 416, 64, 801, 982, 567, 123, 185, 498, 286, 400, 178, 524, 615, 239, 83, 257, 559, 76, 365, 139, 277, 274, 349, 202, 582, 504, 699, 170, 628, 85, 42, 571, 836, 937, 673, 398, 809, 871, 593, 948, 517, 525, 995, 976, 799, 630, 932, 314, 401, 596, 705, 288, 22, 907, 667, 681, 896, 862, 860, 576, 991, 159, 867, 458, 584, 260, 389, 505, 320, 744, 175, 675, 659, 543, 757, 160, 146, 645, 59, 186, 969, 347, 874, 654, 213, 523, 825, 252, 774, 242, 142, 599, 445, 71, 997, 626, 665, 192, 476, 637, 557, 284, 10, 679, 900, 806, 3, 422, 282, 409, 247, 692, 189, 911, 742, 360, 63, 833, 457, 394, 285, 225, 220, 17, 153, 578, 37, 954, 81, 719, 454, 668, 945, 182, 570, 777, 611, 151, 310, 588, 540, 134, 542, 710, 251, 664, 984, 683, 462, 377, 795, 299, 102, 648, 817, 803, 751, 518, 90, 118, 491, 43, 236, 678, 515, 20, 467, 372, 643, 408, 334, 1000, 979, 759, 891, 104, 581, 579, 470, 985, 745, 292, 103, 15, 86, 794, 96, 612, 528, 631, 669, 564, 114, 843, 120, 417, 629, 641, 94, 880, 729, 122, 778, 956, 296, 973, 827, 117, 41, 939, 419, 591, 816, 970, 174, 918, 822, 755, 583, 946, 89, 308, 217, 600, 788, 167, 325, 233, 527, 453, 6, 303, 318, 425, 379, 684, 88, 858, 632, 306, 438, 130, 75, 269, 386, 268, 800, 126, 826, 962, 690, 712, 74, 440, 535, 375, 750, 855, 959, 775, 944, 562, 658, 55, 460, 254, 740, 355, 307, 13, 384, 859, 635, 388, 407, 474, 191, 561, 566, 363, 655, 397, 852, 711, 653, 345, 115, 492, 789, 209, 779, 138, 27, 996, 577, 25, 304, 847, 369, 337, 897, 829, 926, 52, 834, 929, 432, 383, 140, 531, 341, 715, 339, 183, 831, 149, 485, 163, 331, 703, 906, 298, 152, 79, 589, 51, 7, 207, 848, 328, 761, 733, 877, 435, 513, 150, 797, 856, 98, 696, 354, 902, 36, 382, 70, 786, 547, 450, 521, 609, 734, 245, 65, 861, 39, 686, 849, 723, 93, 606, 974, 966, 627, 99, 813, 574, 662, 330, 961, 666, 876, 955, 161, 241, 184, 364, 717, 597, 550, 787, 478, 162, 26, 563, 166, 921, 940, 639, 338, 351, 414, 722, 9, 957, 165, 846, 575, 865, 195, 619, 869, 404, 674, 802, 617, 481, 181, 555, 510, 57, 844, 482, 647, 509, 11, 459, 931, 410, 981, 999, 32, 235, 780, 680, 8, 276, 499, 471, 275, 967, 580, 727, 736, 506, 772, 145, 663, 327, 319, 709, 340, 248, 359, 68, 180, 381, 556, 289, 972, 698, 810, 12, 718, 758, 533, 60, 250, 601, 125, 752, 455, 922, 923, 357, 691, 634, 625, 258, 405, 990, 293, 72, 256, 687, 294, 989, 732, 737, 211, 872, 832, 324, 916, 776, 650, 670, 866, 173, 374, 805, 901, 121, 312, 332};
    public static void main(String[] args) {
        // Perform performance comparison and display results
        performComparison();
    }

    public static void performComparison() {
        // Generate input data for sorting
        LinkedListNode linkedListData = generateLinkedList();

        // Print original sequence
        System.out.println("Original Array: " + Arrays.toString(arrayData));
        System.out.println("Original Linked List: " + linkedListToString(linkedListData));

        // Perform bubble sort on arrays
        int[] arrayCopy = arrayData.clone();
        long arrayStartTime = System.nanoTime();
        bubbleSort(arrayCopy);
        long arrayEndTime = System.nanoTime();
        long arrayRuntime = arrayEndTime - arrayStartTime;
        System.out.println("Sorted Array: " + Arrays.toString(arrayCopy));
        System.out.println("Array Sorting Runtime: " + arrayRuntime + " nanoseconds");

        // Perform bubble sort on linked lists
        LinkedListNode linkedListCopy = linkedListData.clone();
        long linkedListStartTime = System.nanoTime();
        bubbleSortLinkedList(linkedListCopy);
        long linkedListEndTime = System.nanoTime();
        long linkedListRuntime = linkedListEndTime - linkedListStartTime;
        System.out.println("Sorted Linked List: " + linkedListToString(linkedListCopy));
        System.out.println("Linked List Sorting Runtime: " + linkedListRuntime + " nanoseconds");
    }

    // Bubble sort implementation for arrays
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Bubble sort implementation for linked lists
    public static void bubbleSortLinkedList(LinkedListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        LinkedListNode current;
        LinkedListNode lastSorted = null;

        do {
            swapped = false;
            current = head;

            while (current.next != lastSorted) {
                if (current.data > current.next.data) {
                    // Swap nodes
                    LinkedListNode temp = current;
                    current = current.next;
                    temp.next = current.next;
                    current.next = temp;
                    swapped = true;
                }
                current = current.next;
            }

            lastSorted = current.next;
        } while (swapped);
    }


    // Helper method to generate a linked list
    public static LinkedListNode generateLinkedList() {
        LinkedListNode head = null;
        LinkedListNode current = null;

        for (int i = 0; i < arrayData.length; i++) {
            LinkedListNode newNode = new LinkedListNode(arrayData[i]);
            if (head == null) {
                head = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = current.next;
            }
        }

        return head;
    }


    // Helper method to convert linked list to string for printing
    public static String linkedListToString(LinkedListNode head) {
        StringBuilder sb = new StringBuilder();
        LinkedListNode current = head;
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }

    // LinkedListNode class definition
    public static class LinkedListNode implements Cloneable {
        public int data;
        public LinkedListNode next;

        public LinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public LinkedListNode clone() {
            try {
                LinkedListNode clone = (LinkedListNode) super.clone();
                if (next != null) {
                    clone.next = next.clone();
                }
                return clone;
            } catch (CloneNotSupportedException e) {
                return null;
            }
        }
    }
}
