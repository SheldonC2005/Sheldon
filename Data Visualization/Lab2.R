length(c(1:24))
sort(c(1,5,8,6,0,5,2,1,4,9,5,3,8,2,6,7,15))
table(c("a","b","a","c","b","a","a","c","b"))
unique(c(1,2,2,3,4,4,5,5,6,7,7,8,9,9))
rev(c(1:20))

data<- iris
dim(data)
colnames(data)
rownames(data)
summary(data)

x<- c(1,2,3)
y<- c(4,5,6)
plot(x,y)
hist(x)
boxplot(x)

x<- 5
if(x>0) {
  print("x is positive")
} else {
  print("x is negative")
}

day<- 3
result<- switch(day,
                "1"="Monday",
                "2"="Tuesday",
                "3"="Wednesday",
                "4"="Thursday",
                "5"="Friday",
                "Weekend")
print(result)

a<-13
b<-5
sum<-a+b
print(sum)
print(a-b)
print(a*b)
print(a/b)
print(paste("Sum :",sum))

numbers<- c(10,20,30,40,50,60,70)
sum<- sum(numbers)
mean<- mean(numbers)
max<- max(numbers)
print(paste("Max :",max))

x <- c(1,2,3,4,5)
y <- c(2,4,6,8,10)
plot(x,y,type="o",col="blue",
     main="Line Plot",
     xlab="X-Axis",
     ylab="Y-Axis")

x <- c(1,2,3,4,5)
y <- c(5,4,3,2,1)
sum <- x+y
diff <- x-y
prod <- x*y
quot <- x/y
print(prod)
print(quot)

install.packages("maps")
library(maps)
library(ggplot2)
world_map <- map_data("world")
ggplot(world_map,aes(x=long,y=lat,group=group))+
  geom_polygon(fill="lightgray",color="black")+
  ggtitle("World Map using ggplot2")

iris
head(iris)
head(iris)
tail(iris)
table(iris$Species)

hist(iris$Sepal.Width)
barplot(iris$Sepal.Width)
pie(table(iris$Sepal.Length))
pie(table(iris$Sepal.Width))

boxplot(iris$Sepal.Length~iris$Species,
        xlab="Species",ylab="Sepal Length",col="blue")

install.packages("scatterplot3d")
library(scatterplot3d)

boxplot(iris$Petal.Length~iris$Sepal.Length,xlab="Petal Length",ylab="Sepal Length",
        main="Petal Legnth vs Sepal Length",col="green")