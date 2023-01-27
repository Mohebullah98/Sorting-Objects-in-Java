# Sorting Objects in Java
## Objects in Java are sorted through two main methods
---
## Sorting by implementing the Comparable interface

### 1. Implement the Comparable interface in the class we want to sort.
```java
class Player implements Comparable<Player> {...}
```
### 2. Override the compareTo method from the Comparable interface.
The compareTo method from the Comparable interface indicates relative ordering between the current object and the received object.

The return type indicates which object will be ordered first:

- Negative: The current object will be ordered first.
- Positive: The received object will be ordered first.
- Zero: Current and received are equal.
``` java
public int compareTo(Player other){
        //Subtracting the received objects goals by current goals will sort in descending order.
        int result = other.goals - goals;
        //If goals are equal, order by assists, otherwise return original result.
        return result == 0 ? other.assists - assists : result;
    }
```
## Implementing the Comparator functional interface
With the Comparator functional interface, we don’t have to implement anything with the class itself. We just need to initialize the interface where we’re sorting.
Sorting with Comparator in three steps:

### 1. Initialize the Comparator interface with the type you want to sort.
### 2. Override the interface with your new compare method implementation.
### 3. Pass the comparator in as a parameter when you call the sort() algorithm.

```java
Comparator<Player> playerComparator = new Comparator<>(){
       public int compare(Player p1,Player p2){
           int result = p2.getGoals() - p1.getGoals();
           return result == 0 ? p2.getAssists() - p1.getAssists() : result;
       }
};
Arrays.sort(players,playerComparator);
```
This can also be implemented with a lambda expression:
```java
Comparator<Player> playerComparator = (p1,p2) -> {
           int result = p2.getGoals() - p1.getGoals();
           return result == 0 ? p2.getAssists() - p1.getAssists() : result;
};
Arrays.sort(players,playerComparator);
```
---
### Check out my blog post for more info on this subject: https://medium.com/strategio/sorting-objects-in-java-811c81055229
