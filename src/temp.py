fin=open("temp.txt","r")

# for line in fin.readlines():
#     line=line.strip()
#     first=line.find("\"")
#     second=line.find("\"",first+1)
#     target=line[first:second+1]

#     print("}else if(theKey.startsWith("+target+")){")
#     print("    mp.get("+target+").add(pb);")


# fin=open("temp.txt","r")
fout=open("tempout.txt","w")

for line in fin.readlines():
    line=line.strip()
    fout.write("areaId.put(\""+line+"\", 8);\n")

# for line in fin.readlines():
#     line=line.strip()
