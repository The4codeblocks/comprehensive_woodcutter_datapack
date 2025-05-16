## Comprehensive Woodcutter
### Feature(s)
~1000 recipes for the stonecutter adding every possible woodshaping-related recipe, generated with included .java file.

### Use guide
Some recipes may not appear as they surpass the stack size limit for certain items

All recipes of wood type `T` from shape `I` to shape `O` look like this:

`stonecut(TI) = roundDown(score(I)/score(O)) TO`

where `score(shape)` is:
```
 logs/stems = 64
 bamboo block = 32
 
 (mosaic) planks = 8
 (mosaic) slab = 4
 (mosaic) stairs = 6
 
 boat/raft = 32
 
 button = 1
 pressure plate = 4
 
 fence = 8
 fence gate = 4
 
 sign = 2
 
 door = 16
 trapdoor = 8

 stick = 2
```

(planks are assumed to be full blocks for generic subdivisions (planks, stairs, slabs) else they're 16px\*2px\*16px)
