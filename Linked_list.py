class DataNode:
    def __init__(self, input_name):
        self.name = input_name
        self.next = None



class SinglyLinkedList:
    def __init__(self):
        self.count = 0
        self.head = None

    def traverse(self):
        if self.head == None:
            print("This is an empty list.")
        else:
            pos = self.head
            while pos != None:
                print("-->", pos.name, end='')
                pos = pos.next
            print("")
        return

    def insertFront(self, data):
        pNew = DataNode(data)
        if self.head == None: #empty
            self.head = pNew
        else:
            pNew.next = self.head
            self.head = pNew
        self.count += 1
        return

    def insertLast(self, data):
        pNew = DataNode(data)
        if self.head == None:
            self.head = pNew
        else:
            pos = self.head
            while pos.next != None:
                pos = pos.next
            pos.next = pNew
            self.count += 1
        return

    def insertBefore(self, node, data):
        pNew = DataNode(data)
        pos = self.head
        
        while pos.next:
            pass

    def delete(self, data):
        if self.head == None:
            print(" Cannot delete", data, " does not exist.")
        else:
            pos = self.head
            while pos.next != data:
                self.next = pos.next
        self.count -= 1


mylist = SinglyLinkedList()
pNew = DataNode("John")
mylist.head = pNew
print(mylist.head.name)
pNew = DataNode("Tony")
mylist.head.next = pNew
print(mylist.head.next.name)
mylist.traverse()
mylist.insertFront("Bill")
mylist.traverse()
mylist.insertLast("Last")
mylist.traverse()
