# Tuple
Provide a simple Tuple class.

A tuple is an object which is contains multiple value(of any type).
All of the tuple implementation in this libraries are inherited directly from class named Tuple<K>. 

The first object index in the tuple are called K or key which is the base data for comparable purpose.
if K in the generic parameter are object from comparable, we will use the default compare function of object K. otherwise, we will use the HashCode for comparation
please note that data contained in a tuple are immutable which is you cannot replace the data upon construction.
