mtcars
str(mtcars)
rownames(mtcars)
colnames(mtcars)

heat.colors(256)

heatmap(as.matrix(mtcars),scale='column',col=heat.colors(256),main="Characteristics of Car Models")

install.packages("igraph")
library(igraph)

g <- graph(c(1,2,2,3,3,4,4,1,2,4,1,3), directed=F)
g
E(g)
V(g)
plot(g)

plot(g,vertex.color="yellow",vertex.size=30,edge.color="black",main="Graph Representation")

#Sparse matrix
g[]

g1 <- graph(c("Sachin","Ganguly","Ganguly","Dhoni","Dhoni","Sachin","Sachin","Dhoni","Raina","Dhoni"))
plot(g1,vertex.color="yellow",vertex.size=60,edge.color="black")
g1[]
degree(g1,mode="all")
degree(g1,mode="in")
degree(g1,mode="out")
diameter(g1,directed=F,weights=NA)

install.packages("arules")
library(arules)