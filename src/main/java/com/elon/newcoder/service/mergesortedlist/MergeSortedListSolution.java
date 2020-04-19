package com.elon.newcoder.service.mergesortedlist;

public class MergeSortedListSolution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        // 在list1和list2中分别查找比标记元素小区的数据
        ListNode result = null;
        ListNode curNode = null;

        while (list1 != null && list2 != null) {
            int flagVal = (list1.val <= list2.val) ? list1.val : list2.val;

            int num1 = getSmallNode(list1, flagVal);
            int num2 = getSmallNode(list2, flagVal);

            while (num1 > 0) {
                if (curNode == null) {
                    curNode = new ListNode(list1.val);
                    result = curNode;
                } else {
                    curNode.next = new ListNode(list1.val);
                    curNode = curNode.next;
                }

                list1 = list1.next;
                --num1;
            }

            while (num2 > 0) {
                if (curNode == null) {
                    curNode = new ListNode(list2.val);
                    result = curNode;
                } else {
                    curNode.next = new ListNode(list2.val);
                    curNode = curNode.next;
                }

                list2 = list2.next;
                --num2;
            }
        }

        appendLastValues(list1, curNode);
        appendLastValues(list2, curNode);

        return result;
    }

    /**
     * 添加归并排序后列表剩余的元素到结果列表中。
     *
     * @param list 列表
     * @param curNode 结果集合的最后一个元素
     * @author elon
     */
    private void appendLastValues(ListNode list, ListNode curNode) {
        while (list != null) {
            curNode.next = new ListNode(list.val);
            curNode = curNode.next;

            list = list.next;
        }
    }

    /**
     * 找出列表中比指定数字小的元素个数.
     *
     * @param list 列表
     * @param val 指定数字
     * @return 比指定数字小的元素个数
     * @author yzy
     */
    private int getSmallNode(ListNode list, int val) {
        int num = 0;
        ListNode l2 = list;
        while (l2 != null && l2.val <= val) {
            ++num;
            l2 = l2.next;
        }

        return num;
    }

    public void test() {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        Merge(list1, list2);
    }
}
