// code here
CSG Floor = new Cube(100, 100, 1).toCSG()
.toXMin() .toYMin() .toZMin()
FirstBuilding = new Cube(20, 20, 30,).toCSG()
.toXMin() .toYMin() .movez(16)

return CSG.unionAll([Floor, FirstBuilding])