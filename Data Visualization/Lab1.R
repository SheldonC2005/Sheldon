Titanic
iris
mtcars
head(mtcars)
tail(mtcars)

x<- 10
y<- 20
z<- x+y
print(z)

a <- c(1,2,3,4,5)
print(a)

mat<- matrix(1:9,nrow=3,ncol=3,byrow=TRUE)
print(mat)

df <- data.frame(Name=c("Jeevanth","Monish"), Age=c(40,50))
print(df)

abs(-5)
sqrt(16)
log(100,10)
exp(1)
sum(c(1,2,3))
mean(c(2,4,6))
median(c(1,3,5,7,9))
floor(sd(c(1,2,3,4,5)))
ceiling(var(c(1:5)))

nchar("hello")
toupper("hello")
tolower("HELLO")
substr("Learning",1,4)
paste("AI","R","too bad",sep="-")

data<-read.csv("data.txt")
data
write.csv(data,"output.txt")
data1<-read.csv("data1.csv")
data
data2<-read.csv("data2.json")
data2
data3<-read.csv("Sheldon Resume.pdf")
data3

help(ggplot)

install.packages("ggplot2")
library(ggplot2)
plot(1:10,main="R Programming for Data Science",xlab="X-axis",ylab="Y-axis")

list<- list(a=1,b=c(2,3,4),c="R")
list[["b"]]
