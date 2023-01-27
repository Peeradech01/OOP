class DataNode:
    def __init__(self, input_name):
        self.name = input_name
        self.next = None


class SinglyLinkedList:
    def __init__(self):
        self.count = 0
        self.head = None

    def traverse(self):
        start = self.head
        if self.head == None:
            print("This is an empty list.")
        else:
            start = self.head
            while start != None:
                print("-->", start.name, end= " ")
                start = start.next
            print("")

    def insertFront(self, data):
        pNew = DataNode(data)
        if self.head == None:
            self.head = pNew
        else:
            pNew.next = self.head
            self.head = pNew
            self.count += 1

    def insertLast(self, data):
        pNew = DataNode(data)
        if self.head == None:
            self.head = pNew
        else:
            start = self.head
            while start.next != None:
                start = start.next
            start.next = pNew
        self.count += 1
            
    def insertBefore(self, node, data):
        pNew = DataNode(data)
        if self.head == None:
            print("Cannot insert", node, "does not exist")
        else:
            prev = self.head
            start = prev.next
            while start.name != node:
                start = start.next
                prev = start
            prev.next = pNew
            pNew.next = start
            
                   
            
    def delete(self, data):
        start = self.head
        while start.next.name != data:
                start = start.next
                if start == None:
                    print("Cannot delete", data, "does not exist.")     
        start.next = start.next.next



mylist = SinglyLinkedList()
mylist.insertFront("Max")
mylist.insertFront("Kan")
mylist.insertFront("Bill")
mylist.traverse()


mylist.insertBefore("Big", "Alex")
mylist.traverse()

