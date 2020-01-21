
# Partition
Library for chunk list of integers to smaller lists with the indicated size.

# Use
```
<dependency>
  <groupId>com.github.belhadj-haythem</groupId>
  <artifactId>partition</artifactId>
  <version>1.0.0</version>
</dependency>
```

# Example
```
final Integer[] liste = new Integer[]{1,2,3,4,5};
result = Partition.chunk(Arrays.asList(liste), 2);

// print : [[1,2],[3,4],[5]]
